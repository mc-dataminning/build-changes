import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record ua(String b, Instant c, long d, to e) {
   public static final MapCodec<ua> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(ua::a),
               arb.m.fieldOf("time_stamp").forGetter(ua::b),
               Codec.LONG.fieldOf("salt").forGetter(ua::c),
               to.a.optionalFieldOf("last_seen", to.b).forGetter(ua::d)
            )
            .apply($$0, ua::new)
   );

   public static ua a(String $$0) {
      return new ua($$0, Instant.now(), 0L, to.b);
   }

   public void a(asb.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public ua.a a(tu $$0) {
      return new ua.a(this.b, this.c, this.d, this.e.a($$0));
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

   public to d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, to.a d) {
      public a(sl $$0) {
         this($$0.d(256), $$0.v(), $$0.readLong(), new to.a($$0));
      }

      public void a(sl $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<ua> a(tu $$0) {
         return this.d.a($$0).map($$0x -> new ua(this.a, this.b, this.c, $$0x));
      }
   }
}
