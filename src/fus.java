import javax.annotation.Nullable;

public interface fus extends fuf {
   long t = 250L;

   default void f(double $$0, double $$1) {
   }

   default boolean a(double $$0, double $$1, int $$2) {
      return false;
   }

   default boolean b(double $$0, double $$1, int $$2) {
      return false;
   }

   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return false;
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return false;
   }

   default boolean a(int $$0, int $$1, int $$2) {
      return false;
   }

   default boolean c(int $$0, int $$1, int $$2) {
      return false;
   }

   default boolean a(char $$0, int $$1) {
      return false;
   }

   @Nullable
   default fse a(fwy $$0) {
      return null;
   }

   default boolean a_(double $$0, double $$1) {
      return false;
   }

   void a(boolean var1);

   boolean aJ_();

   @Nullable
   default fse aK_() {
      return this.aJ_() ? fse.a(this) : null;
   }

   default fxc J() {
      return fxc.a();
   }

   default fxc b(fxa $$0) {
      return this.J().c($$0);
   }
}
