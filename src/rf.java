import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class rf {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<sa> c;
   @Nullable
   private final Consumer<amp> d;
   @Nullable
   private final Consumer<amp> e;

   public rf(String $$0, Collection<sa> $$1, @Nullable Consumer<amp> $$2, @Nullable Consumer<amp> $$3) {
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

   public Collection<sa> b() {
      return this.c;
   }

   public void a(amp $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(amp $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
