import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xh(String b, Instant c, long d, wv e) {
   public static final MapCodec<xh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xh::a),
               ayh.q.fieldOf("time_stamp").forGetter(xh::b),
               Codec.LONG.fieldOf("salt").forGetter(xh::c),
               wv.a.optionalFieldOf("last_seen", wv.b).forGetter(xh::d)
            )
            .apply($$0, xh::new)
   );

   public static xh a(String $$0) {
      return new xh($$0, Instant.now(), 0L, wv.b);
   }

   public void a(azk.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xh.a a(xb $$0) {
      return new xh.a(this.b, this.c, this.d, this.e.a($$0));
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

   public wv d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, wv.a d) {
      public a(vl $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new wv.a($$0));
      }

      public void a(vl $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xh> a(xb $$0) {
         return this.d.a($$0).map($$0x -> new xh(this.a, this.b, this.c, $$0x));
      }
   }
}
