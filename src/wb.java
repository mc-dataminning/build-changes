import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record wb(int b, UUID c, UUID d) {
   public static final Codec<wb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atx.i.fieldOf("index").forGetter(wb::b), ja.a.fieldOf("sender").forGetter(wb::c), ja.a.fieldOf("session_id").forGetter(wb::d))
            .apply($$0, wb::new)
   );

   public static wb a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static wb a(UUID $$0, UUID $$1) {
      return new wb(0, $$0, $$1);
   }

   public void a(avc.a $$0) throws SignatureException {
      $$0.update(ja.b(this.c));
      $$0.update(ja.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(wb $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public wb a() {
      return this.b == Integer.MAX_VALUE ? null : new wb(this.b + 1, this.c, this.d);
   }
}
