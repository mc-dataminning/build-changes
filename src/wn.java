import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class wn implements vg {
   public static final MapCodec<wn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(wn::b), Codec.STRING.fieldOf("objective").forGetter(wn::d)).apply($$0, wn::new)
   );
   public static final MapCodec<wn> b = a.fieldOf("score");
   public static final vg.a<wn> c = new vg.a<>(b, "score");
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

   public wn(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public vg.a<?> a() {
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

   private emv a(ds $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends blu> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw ef.a.create();
            }

            return $$1.get(0);
         }
      }

      return emv.d(this.d);
   }

   private vt a(emv $$0, ds $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         emw $$3 = $$2.aH();
         emo $$4 = $$3.a(this.f);
         if ($$4 != null) {
            ems $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(wy.b));
            }
         }
      }

      return vf.i();
   }

   @Override
   public vt a(@Nullable ds $$0, @Nullable blu $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return vf.i();
      } else {
         emv $$3 = this.a($$0);
         emv $$4 = (emv)($$1 != null && $$3.equals(emv.cv) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wn $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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
