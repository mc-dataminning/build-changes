import java.util.EnumMap;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public enum hmr implements hnf {
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

   private static final hmr[][] r = ag.a(new hmr[i.values().length][i.values().length], $$0 -> {
      for (hmr $$1 : values()) {
         $$0[$$1.s.ordinal()][$$1.t.ordinal()] = $$1;
      }
   });
   private final i s;
   private final i t;
   final k u;
   private final h v;
   final Map<jc, Matrix4fc> w = new EnumMap<>(jc.class);
   final Map<jc, Matrix4fc> x = new EnumMap<>(jc.class);
   private final hmr.a y = new hmr.a(this);

   private hmr(final i $$0, final i $$1) {
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

   public static hmr a(i $$0, i $$1) {
      return r[$$0.ordinal()][$$1.ordinal()];
   }

   public h b() {
      return this.v;
   }

   public hnf c() {
      return this.y;
   }

   static record a(hmr a) implements hnf {
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

      public hmr b() {
         return this.a;
      }
   }
}
