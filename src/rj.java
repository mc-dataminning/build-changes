import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class rj {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<se> c;
   @Nullable
   private final Consumer<and> d;
   @Nullable
   private final Consumer<and> e;

   public rj(String $$0, Collection<se> $$1, @Nullable Consumer<and> $$2, @Nullable Consumer<and> $$3) {
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

   public Collection<se> b() {
      return this.c;
   }

   public void a(and $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(and $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
