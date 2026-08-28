import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.util.UndashedUuid;
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

public final class ka {
   public static final Codec<UUID> a = Codec.INT_STREAM.comapFlatMap($$0 -> ag.a($$0, 4).map(ka::a), $$0 -> Arrays.stream(a($$0)));
   public static final Codec<Set<UUID>> b = Codec.list(a).xmap(Sets::newHashSet, Lists::newArrayList);
   public static final Codec<Set<UUID>> c = Codec.list(a).xmap(Sets::newLinkedHashSet, Lists::newArrayList);
   public static final Codec<UUID> d = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(UUID.fromString($$0), Lifecycle.stable());
      } catch (IllegalArgumentException var2) {
         return DataResult.error(() -> "Invalid UUID " + $$0 + ": " + var2.getMessage());
      }
   }, UUID::toString);
   public static final Codec<UUID> e = Codec.withAlternative(Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(UndashedUuid.fromStringLenient($$0), Lifecycle.stable());
      } catch (IllegalArgumentException var2) {
         return DataResult.error(() -> "Invalid UUID " + $$0 + ": " + var2.getMessage());
      }
   }, UndashedUuid::toString), a);
   public static final Codec<UUID> f = Codec.withAlternative(a, d);
   public static final ze<ByteBuf, UUID> g = new ze<ByteBuf, UUID>() {
      public UUID a(ByteBuf $$0) {
         return vy.h($$0);
      }

      public void a(ByteBuf $$0, UUID $$1) {
         vy.a($$0, $$1);
      }
   };
   public static final int h = 16;
   private static final String i = "OfflinePlayer:";

   private ka() {
   }

   public static UUID a(int[] $$0) {
      return new UUID((long)$$0[0] << 32 | (long)$$0[1] & 4294967295L, (long)$$0[2] << 32 | (long)$$0[3] & 4294967295L);
   }

   public static int[] a(UUID $$0) {
      long $$1 = $$0.getMostSignificantBits();
      long $$2 = $$0.getLeastSignificantBits();
      return a($$1, $$2);
   }

   private static int[] a(long $$0, long $$1) {
      return new int[]{(int)($$0 >> 32), (int)$$0, (int)($$1 >> 32), (int)$$1};
   }

   public static byte[] b(UUID $$0) {
      byte[] $$1 = new byte[16];
      ByteBuffer.wrap($$1).order(ByteOrder.BIG_ENDIAN).putLong($$0.getMostSignificantBits()).putLong($$0.getLeastSignificantBits());
      return $$1;
   }

   public static UUID a(Dynamic<?> $$0) {
      int[] $$1 = $$0.asIntStream().toArray();
      if ($$1.length != 4) {
         throw new IllegalArgumentException("Could not read UUID. Expected int-array of length 4, got " + $$1.length + ".");
      } else {
         return a($$1);
      }
   }

   public static UUID a(String $$0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + $$0).getBytes(StandardCharsets.UTF_8));
   }

   public static GameProfile b(String $$0) {
      UUID $$1 = a($$0);
      return new GameProfile($$1, $$0);
   }
}
