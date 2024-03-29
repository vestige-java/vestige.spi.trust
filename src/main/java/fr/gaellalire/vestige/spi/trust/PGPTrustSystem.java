/*
 * Copyright 2020 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.gaellalire.vestige.spi.trust;

import java.io.InputStream;

/**
 * @author Gael Lalire
 */
public interface PGPTrustSystem extends TrustSystem {

    PGPSignature loadSignature(InputStream inputStream) throws TrustException;

    PGPPrivatePart getDefaultPrivatePart() throws TrustException;

    PGPPrivatePart getPrivatePart(String pgpKey) throws TrustException;

    PGPPublicPart getPublicPart(String pgpKey) throws TrustException;

}
