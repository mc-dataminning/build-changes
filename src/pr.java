import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class pr {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<qn> c;
   @Nullable
   private final Consumer<akt> d;
   @Nullable
   private final Consumer<akt> e;

   public pr(String $$0, Collection<qn> $$1, @Nullable Consumer<akt> $$2, @Nullable Consumer<akt> $$3) {
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

   public Collection<qn> b() {
      return this.c;
   }

   public void a(akt $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(akt $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
