import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record tw(String b, Instant c, long d, tk e) {
   public static final MapCodec<tw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(tw::a),
               aqw.m.fieldOf("time_stamp").forGetter(tw::b),
               Codec.LONG.fieldOf("salt").forGetter(tw::c),
               tk.a.optionalFieldOf("last_seen", tk.b).forGetter(tw::d)
            )
            .apply($$0, tw::new)
   );

   public static tw a(String $$0) {
      return new tw($$0, Instant.now(), 0L, tk.b);
   }

   public void a(arw.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public tw.a a(tq $$0) {
      return new tw.a(this.b, this.c, this.d, this.e.a($$0));
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

   public tk d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, tk.a d) {
      public a(sh $$0) {
         this($$0.d(256), $$0.v(), $$0.readLong(), new tk.a($$0));
      }

      public void a(sh $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<tw> a(tq $$0) {
         return this.d.a($$0).map($$0x -> new tw(this.a, this.b, this.c, $$0x));
      }
   }
}
