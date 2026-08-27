import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record wl(int b, UUID c, UUID d) {
   public static final Codec<wl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avq.i.fieldOf("index").forGetter(wl::b), jc.a.fieldOf("sender").forGetter(wl::c), jc.a.fieldOf("session_id").forGetter(wl::d))
            .apply($$0, wl::new)
   );

   public static wl a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static wl a(UUID $$0, UUID $$1) {
      return new wl(0, $$0, $$1);
   }

   public void a(awt.a $$0) throws SignatureException {
      $$0.update(jc.b(this.c));
      $$0.update(jc.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(wl $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public wl a() {
      return this.b == Integer.MAX_VALUE ? null : new wl(this.b + 1, this.c, this.d);
   }
}
