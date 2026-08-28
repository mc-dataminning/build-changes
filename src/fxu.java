import java.util.List;

public enum fxu implements dbn {
   a(dbx.c, dbx.a, dbx.d, dbx.b),
   b(dbx.e, dbx.f, dbx.g),
   c(dbx.h, dbx.i),
   d(dbx.j);

   private final List<dby> e;

   private fxu(final dby... $$0) {
      this.e = List.of($$0);
   }

   public List<dby> a() {
      return this.e;
   }
}
