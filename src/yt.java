import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class yt implements xm {
   public static final MapCodec<yt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(yt::b), Codec.STRING.fieldOf("objective").forGetter(yt::d)).apply($$0, yt::new)
   );
   public static final MapCodec<yt> b = a.fieldOf("score");
   public static final xm.a<yt> c = new xm.a<>(b, "score");
   private final String d;
   @Nullable
   private final he e;
   private final String f;

   @Nullable
   private static he a(String $$0) {
      try {
         return new hf(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public yt(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public xm.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public he c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private ewp a(ep $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bsp> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw fc.a.create();
            }

            return $$1.get(0);
         }
      }

      return ewp.c(this.d);
   }

   private xz a(ewp $$0, ep $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         ewq $$3 = $$2.aK();
         ewi $$4 = $$3.a(this.f);
         if ($$4 != null) {
            ewm $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(ze.b));
            }
         }
      }

      return xl.i();
   }

   @Override
   public xz a(@Nullable ep $$0, @Nullable bsp $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xl.i();
      } else {
         ewp $$3 = this.a($$0);
         ewp $$4 = (ewp)($$1 != null && $$3.equals(ewp.cy) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yt $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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
