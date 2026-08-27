import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class pp {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<ql> c;
   @Nullable
   private final Consumer<akn> d;
   @Nullable
   private final Consumer<akn> e;

   public pp(String $$0, Collection<ql> $$1, @Nullable Consumer<akn> $$2, @Nullable Consumer<akn> $$3) {
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

   public Collection<ql> b() {
      return this.c;
   }

   public void a(akn $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(akn $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
