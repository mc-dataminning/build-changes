import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xb(String b, Instant c, long d, wp e) {
   public static final MapCodec<xb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xb::a),
               awu.m.fieldOf("time_stamp").forGetter(xb::b),
               Codec.LONG.fieldOf("salt").forGetter(xb::c),
               wp.a.optionalFieldOf("last_seen", wp.b).forGetter(xb::d)
            )
            .apply($$0, xb::new)
   );

   public static xb a(String $$0) {
      return new xb($$0, Instant.now(), 0L, wp.b);
   }

   public void a(axx.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xb.a a(wv $$0) {
      return new xb.a(this.b, this.c, this.d, this.e.a($$0));
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

   public wp d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, wp.a d) {
      public a(vi $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new wp.a($$0));
      }

      public void a(vi $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xb> a(wv $$0) {
         return this.d.a($$0).map($$0x -> new xb(this.a, this.b, this.c, $$0x));
      }
   }
}
