import java.util.EnumMap;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public enum hnd implements hnr {
   a(i.a, i.a),
   b(i.a, i.b),
   c(i.a, i.c),
   d(i.a, i.d),
   e(i.b, i.a),
   f(i.b, i.b),
   g(i.b, i.c),
   h(i.b, i.d),
   i(i.c, i.a),
   j(i.c, i.b),
   k(i.c, i.c),
   l(i.c, i.d),
   m(i.d, i.a),
   n(i.d, i.b),
   o(i.d, i.c),
   p(i.d, i.d);

   private static final hnd[][] r = ag.a(new hnd[i.values().length][i.values().length], $$0 -> {
      for (hnd $$1 : values()) {
         $$0[$$1.s.ordinal()][$$1.t.ordinal()] = $$1;
      }
   });
   private final i s;
   private final i t;
   final k u;
   private final h v;
   final Map<jc, Matrix4fc> w = new EnumMap<>(jc.class);
   final Map<jc, Matrix4fc> x = new EnumMap<>(jc.class);
   private final hnd.a y = new hnd.a(this);

   private hnd(final i $$0, final i $$1) {
      this.s = $$0;
      this.t = $$1;
      this.v = h.a($$0, $$1);
      if (this.v != h.a) {
         this.u = new k(new Matrix4f(this.v.b()));
      } else {
         this.u = k.a();
      }

      for (jc $$2 : jc.values()) {
         Matrix4fc $$3 = iv.a(this.u, $$2).c();
         this.w.put($$2, $$3);
         this.x.put($$2, $$3.invertAffine(new Matrix4f()));
      }
   }

   @Override
   public k a() {
      return this.u;
   }

   public static hnd a(i $$0, i $$1) {
      return r[$$0.ordinal()][$$1.ordinal()];
   }

   public h b() {
      return this.v;
   }

   public hnr c() {
      return this.y;
   }

   static record a(hnd a) implements hnr {
      @Override
      public k a() {
         return this.a.u;
      }

      @Override
      public Matrix4fc a(jc $$0) {
         return this.a.w.getOrDefault($$0, q);
      }

      @Override
      public Matrix4fc b(jc $$0) {
         return this.a.x.getOrDefault($$0, q);
      }

      public hnd b() {
         return this.a;
      }
   }
}
