import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record tx(String b, Instant c, long d, tl e) {
   public static final MapCodec<tx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(tx::a),
               aqy.m.fieldOf("time_stamp").forGetter(tx::b),
               Codec.LONG.fieldOf("salt").forGetter(tx::c),
               tl.a.optionalFieldOf("last_seen", tl.b).forGetter(tx::d)
            )
            .apply($$0, tx::new)
   );

   public static tx a(String $$0) {
      return new tx($$0, Instant.now(), 0L, tl.b);
   }

   public void a(ary.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public tx.a a(tr $$0) {
      return new tx.a(this.b, this.c, this.d, this.e.a($$0));
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

   public tl d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, tl.a d) {
      public a(si $$0) {
         this($$0.d(256), $$0.v(), $$0.readLong(), new tl.a($$0));
      }

      public void a(si $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<tx> a(tr $$0) {
         return this.d.a($$0).map($$0x -> new tx(this.a, this.b, this.c, $$0x));
      }
   }
}
