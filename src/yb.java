import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yb implements wt {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(yb::b), axe.a(wu.a, "separator").forGetter(yb::d)).apply($$0, yb::new)
   );
   public static final wt.a<yb> b = new wt.a<>(a, "selector");
   private final String e;
   @Nullable
   private final gr f;
   protected final Optional<ws> c;

   public yb(String $$0, Optional<ws> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static gr a(String $$0) {
      gr $$1 = null;

      try {
         gs $$2 = new gs(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public wt.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gr c() {
      return this.f;
   }

   public Optional<ws> d() {
      return this.c;
   }

   @Override
   public xg a(@Nullable ec $$0, @Nullable bql $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends ws> $$3 = wv.a($$0, this.c, $$1, $$2);
         return wv.a(this.f.b($$0), $$3, bql::O_);
      } else {
         return ws.i();
      }
   }

   @Override
   public <T> Optional<T> a(wx.b<T> $$0, xp $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(wx.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yb $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
