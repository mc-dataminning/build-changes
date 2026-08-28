import java.util.EnumMap;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public enum hlk implements hly {
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

   private static final hlk[][] r = ag.a(new hlk[i.values().length][i.values().length], $$0 -> {
      for (hlk $$1 : values()) {
         $$0[$$1.s.ordinal()][$$1.t.ordinal()] = $$1;
      }
   });
   private final i s;
   private final i t;
   final k u;
   private final h v;
   final Map<jb, Matrix4fc> w = new EnumMap<>(jb.class);
   final Map<jb, Matrix4fc> x = new EnumMap<>(jb.class);
   private final hlk.a y = new hlk.a(this);

   private hlk(final i $$0, final i $$1) {
      this.s = $$0;
      this.t = $$1;
      this.v = h.a($$0, $$1);
      if (this.v != h.a) {
         this.u = new k(new Matrix4f(this.v.b()));
      } else {
         this.u = k.a();
      }

      for (jb $$2 : jb.values()) {
         Matrix4fc $$3 = iu.a(this.u, $$2).c();
         this.w.put($$2, $$3);
         this.x.put($$2, $$3.invertAffine(new Matrix4f()));
      }
   }

   @Override
   public k a() {
      return this.u;
   }

   public static hlk a(i $$0, i $$1) {
      return r[$$0.ordinal()][$$1.ordinal()];
   }

   public h b() {
      return this.v;
   }

   public hly c() {
      return this.y;
   }

   static record a(hlk a) implements hly {
      @Override
      public k a() {
         return this.a.u;
      }

      @Override
      public Matrix4fc a(jb $$0) {
         return this.a.w.getOrDefault($$0, q);
      }

      @Override
      public Matrix4fc b(jb $$0) {
         return this.a.x.getOrDefault($$0, q);
      }

      public hlk b() {
         return this.a;
      }
   }
}
