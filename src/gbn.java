import java.util.List;

public enum gbn implements ddb {
   a(ddl.c, ddl.a, ddl.d, ddl.b),
   b(ddl.e, ddl.f, ddl.g),
   c(ddl.h, ddl.i),
   d(ddl.j);

   private final List<ddm> e;

   private gbn(final ddm... $$0) {
      this.e = List.of($$0);
   }

   public List<ddm> a() {
      return this.e;
   }
}
