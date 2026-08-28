import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record yb(String b, Instant c, long d, xp e) {
   public static final MapCodec<yb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(yb::a),
               ayt.q.fieldOf("time_stamp").forGetter(yb::b),
               Codec.LONG.fieldOf("salt").forGetter(yb::c),
               xp.a.optionalFieldOf("last_seen", xp.b).forGetter(yb::d)
            )
            .apply($$0, yb::new)
   );

   public static yb a(String $$0) {
      return new yb($$0, Instant.now(), 0L, xp.b);
   }

   public void a(azw.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public yb.a a(xv $$0) {
      return new yb.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xp d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xp.a d) {
      public a(wf $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xp.a($$0));
      }

      public void a(wf $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<yb> a(xv $$0) {
         return this.d.a($$0).map($$0x -> new yb(this.a, this.b, this.c, $$0x));
      }
   }
}
