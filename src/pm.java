import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class pm {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<qi> c;
   @Nullable
   private final Consumer<akk> d;
   @Nullable
   private final Consumer<akk> e;

   public pm(String $$0, Collection<qi> $$1, @Nullable Consumer<akk> $$2, @Nullable Consumer<akk> $$3) {
      if ($$1.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }
   }

   public String a() {
      return this.b;
   }

   public Collection<qi> b() {
      return this.c;
   }

   public void a(akk $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(akk $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
