import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class pn {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<qj> c;
   @Nullable
   private final Consumer<aki> d;
   @Nullable
   private final Consumer<aki> e;

   public pn(String $$0, Collection<qj> $$1, @Nullable Consumer<aki> $$2, @Nullable Consumer<aki> $$3) {
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

   public Collection<qj> b() {
      return this.c;
   }

   public void a(aki $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(aki $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
