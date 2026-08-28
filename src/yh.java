import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record yh(String b, Instant c, long d, xv e) {
   public static final MapCodec<yh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(yh::a),
               ayf.o.fieldOf("time_stamp").forGetter(yh::b),
               Codec.LONG.fieldOf("salt").forGetter(yh::c),
               xv.a.optionalFieldOf("last_seen", xv.b).forGetter(yh::d)
            )
            .apply($$0, yh::new)
   );

   public static yh a(String $$0) {
      return new yh($$0, Instant.now(), 0L, xv.b);
   }

   public void a(azj.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public yh.a a(yb $$0) {
      return new yh.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xv d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xv.a d) {
      public a(wl $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xv.a($$0));
      }

      public void a(wl $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<yh> a(yb $$0) {
         return this.d.a($$0).map($$0x -> new yh(this.a, this.b, this.c, $$0x));
      }
   }
}
