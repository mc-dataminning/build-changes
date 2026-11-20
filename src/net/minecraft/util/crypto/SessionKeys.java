package net.minecraft.util.crypto;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.apache.commons.codec.binary.Base32;

public record SessionKeys(
   SessionCommonInfo sessionCommonInfo,
   PublicPeerInfo peerInfoA,
   PublicPeerInfo peerInfoB,
   SecretKey streamAToB,
   SecretKey streamBToA,
   SecretKey authSignature,
   SecretKey integritySignature
) {
   private static final Base32 BASE_32_HEX = Base32.builder().setHexEncodeTable(true).get();
   public static final byte DIGEST_SEPARATOR = 43;

   public SecretKey inboundStreamKey(final SessionKeyExchange.Side ownSide) {
      return switch (ownSide) {
         case A -> this.streamBToA();
         case B -> this.streamAToB();
      };
   }

   public SecretKey outboundStreamKey(final SessionKeyExchange.Side ownSide) {
      return switch (ownSide) {
         case A -> this.streamAToB();
         case B -> this.streamBToA();
      };
   }

   public PublicPeerInfo peerInfo(final SessionKeyExchange.Side ownSide) {
      return switch (ownSide) {
         case A -> this.peerInfoA;
         case B -> this.peerInfoB;
      };
   }

   public String computeKeysAuthenticationDigest() {
      try {
         Mac mac = Mac.getInstance("HmacSHA256");
         mac.init(this.authSignature);
         mac.update(this.peerInfoA.publicKey().getEncoded());
         mac.update((byte)43);
         mac.update(this.peerInfoB.publicKey().getEncoded());
         byte[] authDigest = mac.doFinal();
         return BASE_32_HEX.encodeToString(Arrays.copyOf(authDigest, 25));
      } catch (Exception e) {
         throw new UnsupportedOperationException(e);
      }
   }

   public byte[] computeIntegrityDigest() {
      try {
         Mac mac = Mac.getInstance("HmacSHA256");
         mac.init(this.integritySignature);
         this.sessionCommonInfo.addToDigest(mac);
         mac.update((byte)43);
         this.peerInfoA.addToDigest(mac);
         mac.update((byte)43);
         this.peerInfoB.addToDigest(mac);
         return mac.doFinal();
      } catch (GeneralSecurityException e) {
         throw new UnsupportedOperationException(e);
      }
   }
}
