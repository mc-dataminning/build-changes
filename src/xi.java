import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xi(String b, Instant c, long d, ww e) {
   public static final MapCodec<xi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xi::a),
               ayi.q.fieldOf("time_stamp").forGetter(xi::b),
               Codec.LONG.fieldOf("salt").forGetter(xi::c),
               ww.a.optionalFieldOf("last_seen", ww.b).forGetter(xi::d)
            )
            .apply($$0, xi::new)
   );

   public static xi a(String $$0) {
      return new xi($$0, Instant.now(), 0L, ww.b);
   }

   public void a(azl.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xi.a a(xc $$0) {
      return new xi.a(this.b, this.c, this.d, this.e.a($$0));
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

   public ww d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, ww.a d) {
      public a(vl $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new ww.a($$0));
      }

      public void a(vl $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xi> a(xc $$0) {
         return this.d.a($$0).map($$0x -> new xi(this.a, this.b, this.c, $$0x));
      }
   }
}
