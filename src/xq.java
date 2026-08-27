import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xq(String b, Instant c, long d, xe e) {
   public static final MapCodec<xq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xq::a),
               axn.m.fieldOf("time_stamp").forGetter(xq::b),
               Codec.LONG.fieldOf("salt").forGetter(xq::c),
               xe.a.optionalFieldOf("last_seen", xe.b).forGetter(xq::d)
            )
            .apply($$0, xq::new)
   );

   public static xq a(String $$0) {
      return new xq($$0, Instant.now(), 0L, xe.b);
   }

   public void a(ayq.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xq.a a(xk $$0) {
      return new xq.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xe d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xe.a d) {
      public a(vx $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xe.a($$0));
      }

      public void a(vx $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xq> a(xk $$0) {
         return this.d.a($$0).map($$0x -> new xq(this.a, this.b, this.c, $$0x));
      }
   }
}
