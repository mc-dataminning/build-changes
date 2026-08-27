import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class up implements tj {
   private static final String b = "*";
   private final String c;
   @Nullable
   private final gc d;
   private final String e;

   @Nullable
   private static gc a(String $$0) {
      try {
         return new gd(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public up(String $$0, String $$1) {
      this.c = $$0;
      this.d = a($$0);
      this.e = $$1;
   }

   public String a() {
      return this.c;
   }

   @Nullable
   public gc b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }

   private String a(dt $$0) throws CommandSyntaxException {
      if (this.d != null) {
         List<? extends bil> $$1 = this.d.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw ee.a.create();
            }

            return $$1.get(0).cx();
         }
      }

      return this.c;
   }

   private String a(String $$0, dt $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         eih $$3 = $$2.aF();
         eie $$4 = $$3.b(this.e);
         if ($$4 != null && $$3.b($$0, $$4)) {
            eig $$5 = $$3.c($$0, $$4);
            return Integer.toString($$5.b());
         }
      }

      return "";
   }

   @Override
   public tv a(@Nullable dt $$0, @Nullable bil $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return ti.h();
      } else {
         String $$3 = this.a($$0);
         String $$4 = $$1 != null && $$3.equals("*") ? $$1.cx() : $$3;
         return ti.b(this.a($$4, $$0));
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof up $$1 && this.c.equals($$1.c) && this.e.equals($$1.e)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.c.hashCode();
      return 31 * $$0 + this.e.hashCode();
   }

   @Override
   public String toString() {
      return "score{name='" + this.c + "', objective='" + this.e + "'}";
   }
}
