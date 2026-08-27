import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class wl implements ve {
   public static final MapCodec<wl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(wl::b), Codec.STRING.fieldOf("objective").forGetter(wl::d)).apply($$0, wl::new)
   );
   public static final MapCodec<wl> b = a.fieldOf("score");
   public static final ve.a<wl> c = new ve.a<>(b, "score");
   private final String d;
   @Nullable
   private final ge e;
   private final String f;

   @Nullable
   private static ge a(String $$0) {
      try {
         return new gf(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public wl(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public ve.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public ge c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private emp a(ds $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends blp> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw ef.a.create();
            }

            return $$1.get(0);
         }
      }

      return emp.d(this.d);
   }

   private vr a(emp $$0, ds $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         emq $$3 = $$2.aH();
         emi $$4 = $$3.a(this.f);
         if ($$4 != null) {
            emm $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(ww.b));
            }
         }
      }

      return vd.i();
   }

   @Override
   public vr a(@Nullable ds $$0, @Nullable blp $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return vd.i();
      } else {
         emp $$3 = this.a($$0);
         emp $$4 = (emp)($$1 != null && $$3.equals(emp.cv) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wl $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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
