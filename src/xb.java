import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xb implements vt {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<xb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(xb::b), avu.a(vu.a, "separator").forGetter(xb::d)).apply($$0, xb::new)
   );
   public static final vt.a<xb> b = new vt.a<>(a, "selector");
   private final String e;
   @Nullable
   private final gi f;
   protected final Optional<vs> c;

   public xb(String $$0, Optional<vs> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static gi a(String $$0) {
      gi $$1 = null;

      try {
         gj $$2 = new gj(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public vt.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gi c() {
      return this.f;
   }

   public Optional<vs> d() {
      return this.c;
   }

   @Override
   public wg a(@Nullable du $$0, @Nullable bof $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends vs> $$3 = vv.a($$0, this.c, $$1, $$2);
         return vv.a(this.f.b($$0), $$3, bof::Q_);
      } else {
         return vs.i();
      }
   }

   @Override
   public <T> Optional<T> a(vx.b<T> $$0, wp $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(vx.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xb $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
