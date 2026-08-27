import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record vm(int b, UUID c, UUID d) {
   public static final Codec<vm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asu.i.fieldOf("index").forGetter(vm::b), iv.a.fieldOf("sender").forGetter(vm::c), iv.a.fieldOf("session_id").forGetter(vm::d))
            .apply($$0, vm::new)
   );

   public static vm a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static vm a(UUID $$0, UUID $$1) {
      return new vm(0, $$0, $$1);
   }

   public void a(atx.a $$0) throws SignatureException {
      $$0.update(iv.b(this.c));
      $$0.update(iv.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(vm $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public vm a() {
      return this.b == Integer.MAX_VALUE ? null : new vm(this.b + 1, this.c, this.d);
   }
}
