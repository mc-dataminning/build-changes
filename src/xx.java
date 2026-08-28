import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xx(int b, UUID c, UUID d) {
   public static final Codec<xx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayy.l.fieldOf("index").forGetter(xx::b), ka.a.fieldOf("sender").forGetter(xx::c), ka.a.fieldOf("session_id").forGetter(xx::d))
            .apply($$0, xx::new)
   );

   public static xx a(UUID $$0) {
      return a($$0, ag.e);
   }

   public static xx a(UUID $$0, UUID $$1) {
      return new xx(0, $$0, $$1);
   }

   public void a(bae.a $$0) throws SignatureException {
      $$0.update(ka.b(this.c));
      $$0.update(ka.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xx $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xx a() {
      return this.b == Integer.MAX_VALUE ? null : new xx(this.b + 1, this.c, this.d);
   }
}
