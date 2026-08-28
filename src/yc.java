import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record yc(String b, Instant c, long d, xq e) {
   public static final MapCodec<yc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(yc::a),
               ayv.q.fieldOf("time_stamp").forGetter(yc::b),
               Codec.LONG.fieldOf("salt").forGetter(yc::c),
               xq.a.optionalFieldOf("last_seen", xq.b).forGetter(yc::d)
            )
            .apply($$0, yc::new)
   );

   public static yc a(String $$0) {
      return new yc($$0, Instant.now(), 0L, xq.b);
   }

   public void a(azy.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public yc.a a(xw $$0) {
      return new yc.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xq d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xq.a d) {
      public a(wg $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xq.a($$0));
      }

      public void a(wg $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<yc> a(xw $$0) {
         return this.d.a($$0).map($$0x -> new yc(this.a, this.b, this.c, $$0x));
      }
   }
}
