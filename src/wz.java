import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class wz implements vr {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<wz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(wz::b), avq.a(vs.a, "separator").forGetter(wz::d)).apply($$0, wz::new)
   );
   public static final vr.a<wz> b = new vr.a<>(a, "selector");
   private final String e;
   @Nullable
   private final gg f;
   protected final Optional<vq> c;

   public wz(String $$0, Optional<vq> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static gg a(String $$0) {
      gg $$1 = null;

      try {
         gh $$2 = new gh(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public vr.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gg c() {
      return this.f;
   }

   public Optional<vq> d() {
      return this.c;
   }

   @Override
   public we a(@Nullable du $$0, @Nullable bnq $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends vq> $$3 = vt.a($$0, this.c, $$1, $$2);
         return vt.a(this.f.b($$0), $$3, bnq::Q_);
      } else {
         return vq.i();
      }
   }

   @Override
   public <T> Optional<T> a(vv.b<T> $$0, wn $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(vv.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wz $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.e.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }

   @Override
   public String toString() {
      return "pattern{" + this.e + "}";
   }
}
