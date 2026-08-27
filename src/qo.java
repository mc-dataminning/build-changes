import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class qo {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<rk> c;
   @Nullable
   private final Consumer<alq> d;
   @Nullable
   private final Consumer<alq> e;

   public qo(String $$0, Collection<rk> $$1, @Nullable Consumer<alq> $$2, @Nullable Consumer<alq> $$3) {
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

   public Collection<rk> b() {
      return this.c;
   }

   public void a(alq $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(alq $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
