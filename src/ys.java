import java.util.UUID;
import javax.annotation.Nullable;

public record ys(UUID a, int b, @Nullable tt c, ua.a d, @Nullable ti e, tl f, te.b g) implements va<ws> {
   public ys(sl $$0) {
      this($$0.o(), $$0.m(), $$0.c(tt::a), new ua.a($$0), $$0.c(sl::l), tl.a($$0), new te.b($$0));
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c, tt::a);
      this.d.a($$0);
      $$0.a(this.e, sl::a);
      tl.a($$0, this.f);
      this.g.a($$0);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   @Override
   public boolean b() {
      return true;
   }

   public int d() {
      return this.b;
   }

   @Nullable
   public tt e() {
      return this.c;
   }

   public ua.a f() {
      return this.d;
   }

   @Nullable
   public ti g() {
      return this.e;
   }

   public tl h() {
      return this.f;
   }

   public te.b i() {
      return this.g;
   }
}
