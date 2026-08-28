import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xt(String b, Instant c, long d, xh e) {
   public static final MapCodec<xt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xt::a),
               ayw.q.fieldOf("time_stamp").forGetter(xt::b),
               Codec.LONG.fieldOf("salt").forGetter(xt::c),
               xh.a.optionalFieldOf("last_seen", xh.b).forGetter(xt::d)
            )
            .apply($$0, xt::new)
   );

   public static xt a(String $$0) {
      return new xt($$0, Instant.now(), 0L, xh.b);
   }

   public void a(bac.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xt.a a(xn $$0) {
      return new xt.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xh d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xh.a d) {
      public a(vw $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xh.a($$0));
      }

      public void a(vw $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xt> a(xn $$0) {
         return this.d.a($$0).map($$0x -> new xt(this.a, this.b, this.c, $$0x));
      }
   }
}
