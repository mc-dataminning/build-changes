import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xz(String b, Instant c, long d, xn e) {
   public static final MapCodec<xz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xz::a),
               azg.q.fieldOf("time_stamp").forGetter(xz::b),
               Codec.LONG.fieldOf("salt").forGetter(xz::c),
               xn.a.optionalFieldOf("last_seen", xn.b).forGetter(xz::d)
            )
            .apply($$0, xz::new)
   );

   public static xz a(String $$0) {
      return new xz($$0, Instant.now(), 0L, xn.b);
   }

   public void a(ban.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xz.a a(xt $$0) {
      return new xz.a(this.b, this.c, this.d, this.e.a($$0));
   }

   public String a() {
      return this.b;
   }

   public Instant b() {
      return this.c;
   }

   public long c() {
      return this.d;
   }

   public xn d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xn.a d) {
      public a(vy $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xn.a($$0));
      }

      public void a(vy $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xz> a(xt $$0) {
         return this.d.a($$0).map($$0x -> new xz(this.a, this.b, this.c, $$0x));
      }
   }
}
