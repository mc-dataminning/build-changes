import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record yb(int b, UUID c, UUID d) {
   public static final Codec<yb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azg.l.fieldOf("index").forGetter(yb::b), ka.a.fieldOf("sender").forGetter(yb::c), ka.a.fieldOf("session_id").forGetter(yb::d))
            .apply($$0, yb::new)
   );

   public static yb a(UUID $$0) {
      return a($$0, ag.e);
   }

   public static yb a(UUID $$0, UUID $$1) {
      return new yb(0, $$0, $$1);
   }

   public void a(ban.a $$0) throws SignatureException {
      $$0.update(ka.b(this.c));
      $$0.update(ka.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(yb $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public yb a() {
      return this.b == Integer.MAX_VALUE ? null : new yb(this.b + 1, this.c, this.d);
   }
}
