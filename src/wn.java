import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record wn(String b, Instant c, long d, wb e) {
   public static final MapCodec<wn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(wn::a),
               awe.n.fieldOf("time_stamp").forGetter(wn::b),
               Codec.LONG.fieldOf("salt").forGetter(wn::c),
               wb.a.optionalFieldOf("last_seen", wb.b).forGetter(wn::d)
            )
            .apply($$0, wn::new)
   );

   public static wn a(String $$0) {
      return new wn($$0, Instant.now(), 0L, wb.b);
   }

   public void a(axh.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public wn.a a(wh $$0) {
      return new wn.a(this.b, this.c, this.d, this.e.a($$0));
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

   public wb d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, wb.a d) {
      public a(uu $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new wb.a($$0));
      }

      public void a(uu $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<wn> a(wh $$0) {
         return this.d.a($$0).map($$0x -> new wn(this.a, this.b, this.c, $$0x));
      }
   }
}
