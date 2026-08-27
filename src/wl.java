import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record wl(String b, Instant c, long d, vz e) {
   public static final MapCodec<wl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(wl::a),
               avu.m.fieldOf("time_stamp").forGetter(wl::b),
               Codec.LONG.fieldOf("salt").forGetter(wl::c),
               vz.a.optionalFieldOf("last_seen", vz.b).forGetter(wl::d)
            )
            .apply($$0, wl::new)
   );

   public static wl a(String $$0) {
      return new wl($$0, Instant.now(), 0L, vz.b);
   }

   public void a(awx.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public wl.a a(wf $$0) {
      return new wl.a(this.b, this.c, this.d, this.e.a($$0));
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

   public vz d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, vz.a d) {
      public a(us $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new vz.a($$0));
      }

      public void a(us $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<wl> a(wf $$0) {
         return this.d.a($$0).map($$0x -> new wl(this.a, this.b, this.c, $$0x));
      }
   }
}
