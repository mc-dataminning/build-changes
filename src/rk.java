import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class rk {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<sf> c;
   @Nullable
   private final Consumer<ane> d;
   @Nullable
   private final Consumer<ane> e;

   public rk(String $$0, Collection<sf> $$1, @Nullable Consumer<ane> $$2, @Nullable Consumer<ane> $$3) {
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

   public Collection<sf> b() {
      return this.c;
   }

   public void a(ane $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(ane $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
