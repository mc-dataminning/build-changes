import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xv(int b, UUID c, UUID d) {
   public static final Codec<xv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayw.l.fieldOf("index").forGetter(xv::b), jz.a.fieldOf("sender").forGetter(xv::c), jz.a.fieldOf("session_id").forGetter(xv::d))
            .apply($$0, xv::new)
   );

   public static xv a(UUID $$0) {
      return a($$0, ag.e);
   }

   public static xv a(UUID $$0, UUID $$1) {
      return new xv(0, $$0, $$1);
   }

   public void a(bac.a $$0) throws SignatureException {
      $$0.update(jz.b(this.c));
      $$0.update(jz.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xv $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xv a() {
      return this.b == Integer.MAX_VALUE ? null : new xv(this.b + 1, this.c, this.d);
   }
}
