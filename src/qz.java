import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class qz {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<ru> c;
   @Nullable
   private final Consumer<ami> d;
   @Nullable
   private final Consumer<ami> e;

   public qz(String $$0, Collection<ru> $$1, @Nullable Consumer<ami> $$2, @Nullable Consumer<ami> $$3) {
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

   public Collection<ru> b() {
      return this.c;
   }

   public void a(ami $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(ami $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
