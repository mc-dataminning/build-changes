import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class yf implements wy {
   public static final MapCodec<yf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(yf::b), Codec.STRING.fieldOf("objective").forGetter(yf::d)).apply($$0, yf::new)
   );
   public static final MapCodec<yf> b = a.fieldOf("score");
   public static final wy.a<yf> c = new wy.a<>(b, "score");
   private final String d;
   @Nullable
   private final gt e;
   private final String f;

   @Nullable
   private static gt a(String $$0) {
      try {
         return new gu(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public yf(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public wy.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public gt c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private evn a(ee $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bru> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw er.a.create();
            }

            return $$1.get(0);
         }
      }

      return evn.c(this.d);
   }

   private xl a(evn $$0, ee $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         evo $$3 = $$2.aK();
         evg $$4 = $$3.a(this.f);
         if ($$4 != null) {
            evk $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yq.b));
            }
         }
      }

      return wx.i();
   }

   @Override
   public xl a(@Nullable ee $$0, @Nullable bru $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wx.i();
      } else {
         evn $$3 = this.a($$0);
         evn $$4 = (evn)($$1 != null && $$3.equals(evn.cz) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yf $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      return 31 * $$0 + this.f.hashCode();
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.f + "'}";
   }
}
