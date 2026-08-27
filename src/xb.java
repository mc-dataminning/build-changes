import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record xb(int b, UUID c, UUID d) {
   public static final Codec<xb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.i.fieldOf("index").forGetter(xb::b), jf.a.fieldOf("sender").forGetter(xb::c), jf.a.fieldOf("session_id").forGetter(xb::d))
            .apply($$0, xb::new)
   );

   public static xb a(UUID $$0) {
      return a($$0, ac.e);
   }

   public static xb a(UUID $$0, UUID $$1) {
      return new xb(0, $$0, $$1);
   }

   public void a(axv.a $$0) throws SignatureException {
      $$0.update(jf.b(this.c));
      $$0.update(jf.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(xb $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public xb a() {
      return this.b == Integer.MAX_VALUE ? null : new xb(this.b + 1, this.c, this.d);
   }
}
