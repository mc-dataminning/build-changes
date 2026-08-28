import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record yo(String b, Instant c, long d, yc e) {
   public static final MapCodec<yo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(yo::a),
               azn.q.fieldOf("time_stamp").forGetter(yo::b),
               Codec.LONG.fieldOf("salt").forGetter(yo::c),
               yc.a.optionalFieldOf("last_seen", yc.b).forGetter(yo::d)
            )
            .apply($$0, yo::new)
   );

   public static yo a(String $$0) {
      return new yo($$0, Instant.now(), 0L, yc.b);
   }

   public void a(baq.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public yo.a a(yi $$0) {
      return new yo.a(this.b, this.c, this.d, this.e.a($$0));
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

   public yc d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, yc.a d) {
      public a(ws $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new yc.a($$0));
      }

      public void a(ws $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<yo> a(yi $$0) {
         return this.d.a($$0).map($$0x -> new yo(this.a, this.b, this.c, $$0x));
      }
   }
}
