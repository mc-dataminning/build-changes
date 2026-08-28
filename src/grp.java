import java.util.UUID;

public interface grp {
   void a(UUID var1, grp.b var2);

   void a(UUID var1, grp.a var2);

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum b {
      a,
      b;
   }
}
