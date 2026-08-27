import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record wj(String b, Instant c, long d, vx e) {
   public static final MapCodec<wj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(wj::a),
               avq.m.fieldOf("time_stamp").forGetter(wj::b),
               Codec.LONG.fieldOf("salt").forGetter(wj::c),
               vx.a.optionalFieldOf("last_seen", vx.b).forGetter(wj::d)
            )
            .apply($$0, wj::new)
   );

   public static wj a(String $$0) {
      return new wj($$0, Instant.now(), 0L, vx.b);
   }

   public void a(awt.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public wj.a a(wd $$0) {
      return new wj.a(this.b, this.c, this.d, this.e.a($$0));
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

   public vx d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, vx.a d) {
      public a(uq $$0) {
         this($$0.d(256), $$0.v(), $$0.readLong(), new vx.a($$0));
      }

      public void a(uq $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<wj> a(wd $$0) {
         return this.d.a($$0).map($$0x -> new wj(this.a, this.b, this.c, $$0x));
      }
   }
}
