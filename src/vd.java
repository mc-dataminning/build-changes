import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record vd(int b, UUID c, UUID d) {
   public static final Codec<vd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asg.i.fieldOf("index").forGetter(vd::b), iv.a.fieldOf("sender").forGetter(vd::c), iv.a.fieldOf("session_id").forGetter(vd::d))
            .apply($$0, vd::new)
   );

   public static vd a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static vd a(UUID $$0, UUID $$1) {
      return new vd(0, $$0, $$1);
   }

   public void a(ati.a $$0) throws SignatureException {
      $$0.update(iv.b(this.c));
      $$0.update(iv.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(vd $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public vd a() {
      return this.b == Integer.MAX_VALUE ? null : new vd(this.b + 1, this.c, this.d);
   }
}
