import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record wn(int b, UUID c, UUID d) {
   public static final Codec<wn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avu.j.fieldOf("index").forGetter(wn::b), je.a.fieldOf("sender").forGetter(wn::c), je.a.fieldOf("session_id").forGetter(wn::d))
            .apply($$0, wn::new)
   );

   public static wn a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static wn a(UUID $$0, UUID $$1) {
      return new wn(0, $$0, $$1);
   }

   public void a(awx.a $$0) throws SignatureException {
      $$0.update(je.b(this.c));
      $$0.update(je.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(wn $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public wn a() {
      return this.b == Integer.MAX_VALUE ? null : new wn(this.b + 1, this.c, this.d);
   }
}
