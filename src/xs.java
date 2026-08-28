import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xs(String b, Instant c, long d, xg e) {
   public static final MapCodec<xs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xs::a),
               axw.o.fieldOf("time_stamp").forGetter(xs::b),
               Codec.LONG.fieldOf("salt").forGetter(xs::c),
               xg.a.optionalFieldOf("last_seen", xg.b).forGetter(xs::d)
            )
            .apply($$0, xs::new)
   );

   public static xs a(String $$0) {
      return new xs($$0, Instant.now(), 0L, xg.b);
   }

   public void a(aza.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xs.a a(xm $$0) {
      return new xs.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xg d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xg.a d) {
      public a(vw $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xg.a($$0));
      }

      public void a(vw $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xs> a(xm $$0) {
         return this.d.a($$0).map($$0x -> new xs(this.a, this.b, this.c, $$0x));
      }
   }
}
