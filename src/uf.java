import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record uf(int b, UUID c, UUID d) {
   public static final Codec<uf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arg.i.fieldOf("index").forGetter(uf::b), ia.a.fieldOf("sender").forGetter(uf::c), ia.a.fieldOf("session_id").forGetter(uf::d))
            .apply($$0, uf::new)
   );

   public static uf a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static uf a(UUID $$0, UUID $$1) {
      return new uf(0, $$0, $$1);
   }

   public void a(asg.a $$0) throws SignatureException {
      $$0.update(ia.b(this.c));
      $$0.update(ia.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(uf $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public uf a() {
      return this.b == Integer.MAX_VALUE ? null : new uf(this.b + 1, this.c, this.d);
   }
}
