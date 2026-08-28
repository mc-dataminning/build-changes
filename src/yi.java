import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record yi(String b, Instant c, long d, xw e) {
   public static final MapCodec<yi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(yi::a),
               ayh.o.fieldOf("time_stamp").forGetter(yi::b),
               Codec.LONG.fieldOf("salt").forGetter(yi::c),
               xw.a.optionalFieldOf("last_seen", xw.b).forGetter(yi::d)
            )
            .apply($$0, yi::new)
   );

   public static yi a(String $$0) {
      return new yi($$0, Instant.now(), 0L, xw.b);
   }

   public void a(azl.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public yi.a a(yc $$0) {
      return new yi.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xw d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xw.a d) {
      public a(wm $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xw.a($$0));
      }

      public void a(wm $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<yi> a(yc $$0) {
         return this.d.a($$0).map($$0x -> new yi(this.a, this.b, this.c, $$0x));
      }
   }
}
